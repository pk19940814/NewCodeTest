package SchoolRecruit2016.Ali.Autumn2017.School.Q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<UnilateralLine> lineList = new ArrayList<UnilateralLine>();
        while (scanner.hasNextLine()) {
            String[] options = scanner.nextLine().split(";");
            if (options.length < 5) {
                break;
            }
            lineList.add(new UnilateralLine(options[0], options[1], options[2], options[3], options[4], options[5]));
        }
        scanner.close();

        // write your code here
        List<String> result = calculateUnilateral(lineList);

        for (String str : result) {
            System.out.println(str);
        }
    }

    public static List<String> calculateUnilateral(List<UnilateralLine> lineList) {
        List<String> result = new ArrayList<String>();
        if (!lineList.isEmpty()) {
            result.add(calRule1(lineList));
            result.add(calRule2(lineList));
            result.add(calRule3(lineList));
        }

        return result;
    }

    public static String calRule2(List<UnilateralLine> lineList) {
        String result = "rule2：";
        if (lineList.isEmpty()) {
            return null;
        } else {
            for (int i = 0; i < lineList.size(); i++) {
                UnilateralLine left = lineList.get(i);
                if (left.isMatched()) {
                    continue;
                }
                for (int j = i + 1; j < lineList.size(); j++) {
                    UnilateralLine mid = lineList.get(i);
                    if (mid.isMatched()) {
                        continue;
                    }
                    for (int k = j + 1; k < lineList.size(); k++) {
                        UnilateralLine right = lineList.get(i);
                        if (mid.isMatched()) {
                            continue;
                        }
                        if (left.eCen.equals(mid.sCen) && mid.eCen.equals(right.sCen) && right.eCen.equals(left.sCen)
                                || left.eCen.equals(right.sCen) && right.eCen.equals(mid.sCen) && mid.eCen.equals(left.sCen)) {
                            left.setMatched(true);
                            right.setMatched(true);
                            mid.setMatched(true);
                            result += (left.id + "+" + mid.id + "+" + right.id + " ");
                        }
                    }

                }
            }
            return result;
        }
    }

    public static String calRule3(List<UnilateralLine> lineList) {
        String result = "rule3：";
        if (lineList.isEmpty()) {
            return null;
        } else {
            for (int i = 0; i < lineList.size(); i++) {
                UnilateralLine left = lineList.get(i);
                if (left.isMatched()) {
                    continue;
                }
                for (int j = i + 1; j < lineList.size(); j++) {
                    UnilateralLine mid = lineList.get(i);
                    if (mid.isMatched()) {
                        continue;
                    }
                    for (int k = j + 1; k < lineList.size(); k++) {
                        UnilateralLine right = lineList.get(i);
                        if (mid.isMatched()) {
                            continue;
                        }
                        if (checkABC(left, mid, right) || checkABC(left, right, mid) || checkABC(right, left, mid)) {
                            left.setMatched(true);
                            right.setMatched(true);
                            mid.setMatched(true);
                            result += (left.id + "+" + mid.id + "+" + right.id + " ");
                        }
                    }

                }
            }
            return result;
        }
    }

    public static boolean checkABC(UnilateralLine left, UnilateralLine mid, UnilateralLine right) {
        if (left.sPro.equals(right.sPro) && ((left.sCen.equals(mid.eCen) && right.eCen.equals(mid.sCen)
                || (right.sCen.equals(mid.eCen) && left.eCen.equals(mid.sCen)))))
            return true;
        else return false;
    }

    public static String calRule1(List<UnilateralLine> lineList) {
        String result = "rule1：";
        if (lineList.isEmpty()) {
            return null;
        } else {
            for (int i = 0; i < lineList.size(); i++) {
                UnilateralLine left = lineList.get(i);
                if (left.isMatched()) {
                    continue;
                }
                for (int j = i + 1; j < lineList.size(); j++) {
                    UnilateralLine right = lineList.get(i);
                    if (right.isMatched() || !left.tType.equals(right.tType)) {
                        continue;
                    }
                    if (left.sCen.equals(right.eCen) && left.eCen.equals(right.sCen)) {
                        left.setMatched(true);
                        right.setMatched(true);
                        result += (left.id + "+" + right.id + " ");
                    }
                }
            }

            for (int i = 0; i < lineList.size(); i++) {
                UnilateralLine left = lineList.get(i);
                if (!left.tType.equals("17.5m") || left.isMatched()) {
                    continue;
                }
                for (int j = 0; j < lineList.size(); j++) {
                    UnilateralLine mid = lineList.get(j);
                    if (!mid.tType.equals("9.6m") || mid.isMatched()
                            || !((left.eCen.equals(mid.sCen) && left.sCen.equals(mid.eCen)) || (left.sCen.equals(mid.eCen) && left.eCen.equals(mid.sCen)))) {
                        continue;
                    }
                    for (int k = 0; k < lineList.size(); k++) {
                        UnilateralLine right = lineList.get(k);
                        if (!right.tType.equals("9.6m") || right.isMatched || (mid.sCen.equals(right.sCen) && mid.eCen.equals(right.eCen))) {
                            left.setMatched(true);
                            mid.setMatched(true);
                            right.setMatched(true);
                            result += (left.id + "+" + mid.id + " " + right.id + " ");
                        }
                    }
                }
            }

            return result;
        }
    }


    public static class UnilateralLine {
        private String id;
        private String sCen;//出发分拨
        private String sPro;//出发省
        private String eCen;//到达分拨
        private String ePro;//到达省
        //9.6m/17.5m
        private String tType;//车型
        private boolean isMatched = false;


        public UnilateralLine(String id, String sCen, String sPro, String eCen, String ePro, String tType) {
            this.id = id;
            this.sCen = sCen;
            this.sPro = sPro;
            this.eCen = eCen;
            this.ePro = ePro;
            this.tType = tType;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getSCen() {
            return sCen;
        }

        public void setSCen(String ePro) {
            this.ePro = ePro;
        }

        public String getSPro() {
            return sPro;
        }

        public void setSPro(String sPro) {
            this.sPro = sPro;
        }

        public String getECen() {
            return eCen;
        }

        public void setECen(String eCen) {
            this.eCen = eCen;
        }

        public String getEPro() {
            return ePro;
        }

        public void setEPro(String ePro) {
            this.ePro = ePro;
        }

        public String getTType() {
            return tType;
        }

        public void setTType(String tType) {
            this.tType = tType;
        }

        public boolean isMatched() {
            return isMatched;
        }

        public void setMatched(boolean matched) {
            isMatched = matched;
        }
    }
}

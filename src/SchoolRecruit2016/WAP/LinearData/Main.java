package SchoolRecruit2016.WAP.LinearData;



import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static Deque<Long> mDeque = new LinkedList<>();
    public static Deque<Long> temp = new LinkedList<>();

    public static void main(String[] args) {

        while (in.hasNext()) {
            int m = in.nextInt();
            for (int i = 0; i < m; i++) {
                String opStr = in.next();
                try {
                    operateList(Operation.getOperationTypeFromStr(opStr));
                } catch (Exception e) {
                    System.out.println("Error");
                }

            }
        }
    }


    public static void reverse() {
        while (!mDeque.isEmpty()) {
            temp.addLast(mDeque.removeFirst());
        }
        while (!temp.isEmpty()) {
            mDeque.addLast(temp.removeLast());
        }
    }


    public static void operateList(Operation operation) throws Exception {
        switch (operation) {
            case PUSH_FRONT:
                long x1 = in.nextLong();
                mDeque.addFirst(x1);
                break;
            case PUSH_BACK:
                long x2 = in.nextLong();
                mDeque.addLast(x2);
                break;
            case POP_FRONT:
                long x3 = mDeque.removeFirst();
                System.out.println(x3);
                break;
            case POP_BACK:
                long x4 = mDeque.removeLast();
                System.out.println(x4);
                break;
            case REVERSE:
                reverse();
                break;
            case MAX:
                System.out.println(Collections.max(mDeque));
                break;
            default:
                break;
        }
    }

    public static enum Operation {
        PUSH_FRONT(1, "push_front"),
        PUSH_BACK(2, "push_back"),
        POP_FRONT(3, "pop_front"),
        POP_BACK(4, "pop_back"),
        REVERSE(5, "reverse"),
        MAX(6, "max");

        private int id;
        private String type;

        private Operation(int id, String type) {
            this.id = id;
            this.type = type;
        }

        public static Operation getOperationTypeFromValue(int value) {
            for (Operation op : Operation.values()) {
                if (op.getId() == value) {
                    return op;
                }
            }
            return null;
        }

        public static Operation getOperationTypeFromStr(String str) {
            for (Operation op : Operation.values()) {
                if (op.getType().equals(str)) {
                    return op;
                }
            }
            return null;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}


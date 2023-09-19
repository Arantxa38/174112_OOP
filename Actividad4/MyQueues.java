package package1;

class MyQueues {
    private char[] queue;
    private int tail;
    private int MAX;

    public MyQueues(int size) {
        MAX = size;
        queue = new char[MAX];
        tail = 0;
    }

    public void insert (char item){
    	if(tail == MAX) {
    		System.out.println("La cola esta llena");
    	} else {
    		queue[tail] = item;
    		tail++; 
    		}
    	}

    public char delete() {
        if (tail > 0) {
            char deletedItem = queue[0];
            for (int i = 0; i < tail - 1; i++) {
                queue[i] = queue[i + 1];
            }
            tail--;
            return deletedItem;
        } else {
            System.out.println("La cola esta vacia");
            return '#';
        }
    }

    public boolean isEmpty() {
        return (tail == 0);
    }
}

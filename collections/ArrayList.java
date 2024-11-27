package collections;

class ArrayList<T>{

	public int size=0;
	public static final int AL_SIZE=10;
	private Object[] arr;
	public ArrayList() {
		arr=new Object[AL_SIZE];
	}

	private void add(T val) {
		if(size==AL_SIZE)
			resize();
		
		arr[size++]=val;
	}


	private void resize() {
		Object arr2[]=new Object[AL_SIZE*2];
		for(int i=0;i<size;i++) {
			arr2[i]=arr[i];
		}
		arr=arr2;
		
	}
	private void print() {
		for(Object i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	private void remove(int index) {
		if(index>size || index<0) {
			System.out.println("No such index found");
		}
		else {
		for(int i=index;i<size;i++) {
			arr[i]=arr[i+1];		
		}
		arr[size-1]=null;
		}
	}
	
	private void clear() {
		for(int i=0;i<size;i++) {
			arr[i]=null;
		}
		size=0;
	}
	
	private void isEmpty() {
		if(size==0)
			System.out.println("ArrayList is Empty");
		else
			System.out.println("ArrayList is not Empty");
	}
public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(2);
		al.add(2);
		al.add(2);
		al.add(21);
		al.add(24);
		al.add(26);
		al.add(2);
		al.add(2);
		al.add(2);
		al.add(2);
		al.add(2);
		al.add(2);
		al.add(2);
		al.print();
		al.isEmpty();
		al.remove(5);
		al.print();
		al.clear();
		al.print();
		al.isEmpty();
		
		
	}



}

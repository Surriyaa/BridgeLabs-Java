package collections;

public class Set<T> {
	public Object set[];
	public int size=0;
	public static final int SET_SIZE=10;
	
	public Set() {
		set=new Object[SET_SIZE];
	}

	private boolean add(T data) {
		if(contains(data)) {
			return false;
		}
		
		set[size++]=data;
		return true;
	}
	
	private boolean contains(T data) {
		for(int i=0;i<size;i++) {
			if(data.equals(set[i]))
				return true;
		}
		
		return false;
	}
	


	public static void main(String[] args) {
		
		Set<Integer> s=new Set<Integer>();
		s.add(9);
		
	}

}

class Util{
	public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		return p1.getKey().equals(p2.getKey())&& p1.getValue().equals(p2.getValue());
	}
	
}


class Pair<K,V>{
	private K  key;
	private V value;
	public Pair(K key, V value) {
		
		this.key = key;
		this.value = value;
		
	}
	public K getKey(){
			return key;
		}
	public V getValue(){
		return value;
	}
		
}


public class App2 {
	public static void main(String[] args) {
	Pair<Integer,String> pair1=new Pair<>(1,"Mg Mg");
	Pair<Integer,String> pair2=new Pair<>(1,"Mg Mg");
	
	boolean same=Util.<Integer,String>compare(pair1, pair2);
	
	System.out.println(same);
	
	}
}

// Last updated: 09/07/2026, 11:17:21
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {

    List<Integer>list=new ArrayList<>();
    int ptr=0;
    int size;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        while(iterator.hasNext())
        {
            list.add(iterator.next());
        }
        size=list.size();
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return list.get(ptr);
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int el=list.get(ptr);
        ptr++;
        return el;
	}
	
	@Override
	public boolean hasNext() {
	    if(ptr<size)
        return true;
        return false;
	}
}
package basic.ds.algo.common;

public class StackImp<TT> {

	/*public static void main(String[] args){
	
	}*/
	public int Count= 0;
	private class Node<T>{
		T data;
		Node<T> next;
		public Node(T data){
			this.data= data;
		}
	}
	//Top element
	private Node<TT> _head ;
	private Node<TT> tail ;
	
	public boolean setHead(Node<TT> node){
		_head = node;	
		return true;
	}
	public Node<TT> getHead(){
		return this._head;
	}
	
	public boolean push(TT data){
		
		if(this._head == null){ 
			_head = new Node<TT>(data);
			Count++;
			return true;
		}
		else{
			Node<TT> temp = this._head;
			this._head = new Node<TT>(data);
			this._head.next = temp;
			Count++;
			return true;
		}
	}
	//Get the last element 
	public TT pop() {
		
		if(this._head == null){
			return null;
		}
		else{
			Node<TT> temp = _head;
			if(this._head.next != null){
				_head = _head.next;
			}
			else{
				_head = null;
			}
			Count--;
			return temp.data;
		}
	}
	public boolean Add(TT data){
		if(this._head == null){
			this._head = new Node<TT>(data);
			return true;
		}
		else{
			
		}
		return false;
	}
	public boolean deleteAfter(Node<TT> element){
		
		Node<TT> currentElement = this._head;
		//Head null case Case
		if(this._head == null) return false;
		//Element null case.
		if(element == null) return false;
		
		//Head match element.
		if(this._head.data.equals(element.data)){
			this._head = this._head.next;
			if(this._head.next == null){
				this.tail = null;
			}
			return true;
		}
		
		//Middle element 
		while(currentElement != null && currentElement.next !=null){
			if(currentElement.next.data.equals(element.data)){
				currentElement.next = element.next;
				if(element.next ==null){
					this.tail = currentElement;
				}
				return true;
			}
			
			currentElement = currentElement.next;
		}
		return false;
		
	}
	public boolean insertAfter(Node<TT> element, TT data){
		return false;
	}
}

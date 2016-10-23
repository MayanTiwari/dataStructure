package basic.ds.algo.common;

public class StackImp<TT> {

	/*public static void main(String[] args){
	
	}*/
	private class Node<T>{
		T data;
		Node<T> next;
		public Node(T data,Node<T> next){
			this.data= data;
			this.next= next;
		}
	}
	//Top element
	private Node<TT> _head;
	
	public boolean setHead(Node<TT> node){
		_head = node;	
		return true;
	}
	public Node<TT> getHead(){
		return this._head;
	}
	
	public boolean push(TT data){
		
		if(this._head == null){
			Node<TT> newhead = new Node<TT>(data,null); 
			_head = newhead;
			return true;
		}
		else{
			Node<TT> newNode = new Node<TT>(data,this.getHead());
			_head = newNode;
			return true;
		}
	}
	//Get the last element 
	public TT pop() {
		
		if(_head != null){
			return null;
		}
		else{
			Node<TT> temp = _head;
			_head = _head.next;
			_head = null	;
			return temp.data;
			
		}
	}
	public boolean deleteAfter(Node<TT> element){
		return false;
	}
	public boolean insertAfter(Node<TT> element){
		return false;
	}
}

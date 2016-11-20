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
	//STACK IMP
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
	//Get the last element STACK IMP 
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
}

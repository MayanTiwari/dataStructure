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
	/*public boolean deleteAfter(Node<TT> element){
		
		//Head Case
		if(this.Count > 0){
			if(this.Count == 1){
				//Only one element
				if(this._head.data == element.data){
					this._head = this.tail = null;
					return true;			
				}
				else{
					return false;
				}
			}
			else{
				if(this._head.data == element.data){
					this._head = this._head.next;
				}
				if(this.tail.data == element.data){
					
				}
				else{
					
				}
			}
		}
		else{
			return false;
		}
		
		
	}*/
	public boolean insertAfter(Node<TT> element, TT data){
		return false;
	}
}

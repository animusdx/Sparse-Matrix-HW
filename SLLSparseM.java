@@ -0,0 +1,105 @@

public class SLLSparseM implements SparseM {

	public class Node<E> {
		public int row;
		public int col;
		public int value;
		public Node<E> nextRow;
		public Node<E> nextCol;


		//Node class initialization

		public Node(int r, int c, int Value, Node rowNext, Node colNext) {
			row = r;
			col = c;
			value = newValue;
			nextRow = rowNext;
			nextCol = colNext;
		}

		//Node constructor

	}


	private int nrows;
	private int ncolumns;


	@Override
	public int nrows() {
		return nrows;
	}

	// Returns the number of rows

	@Override
	public int ncols() {
		return ncols;
	}

	// Returns the number of columns


	@Override
	public int numElements() {
		return nelements;
	}

	// Returns the number of non-zero elements

	@Override
	public int getElement(int row, int col) {
		if(outOfBounds(ridx,cidx))
			return -1;
		return elements[row][col];
	}

	public int getRow (Node row){
		if (outofbounds (row))
			return -1;

		return Node.nextRow();

	}
	// Returns -1 if row index and column index are larger than the size of the matrix. If viable, returns a particular
	// row index and column index.

	@Override
	public void clearElement(int ridx, int cidx) {
		if(outOfBounds(ridx,cidx))
			return;
		int tmp = elements[ridx][cidx];
		elements[ridx][cidx] = 0;	//set the element to zero
		if(tmp != 0)				//if the original element is nonzero, decrement nelements by 1
			nelements--;
		return;
	}
	// Erases/clears a node at specified row index column index.

	@Override
	public void setElement(int ridx, int cidx, int val) {


	}

	@Override
	public void getAllElements(int[] ridx, int[] cidx, int[] val) {


	}

	@Override
	public void addition(SparseM otherM) {
		if (this.Node == otherM.Node(){


		}



	}

}

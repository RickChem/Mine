package edu.nju.controller.msgqueue.operation;

import edu.nju.controller.msgqueue.OperationQueue;
import edu.nju.model.service.ChessBoardModelService;

public class DoubleLeftClickOperation extends MineOperation{

	private int x;
	private int y;
	
	public DoubleLeftClickOperation(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ChessBoardModelService chess = OperationQueue.getChessBoardModel();
		chess.quickExcavate(x, y);
	}

}

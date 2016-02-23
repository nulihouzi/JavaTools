package com.eclipse.test;

/**
 * 太空船控制模块代理类
 * 代理的含义：将成员对象置于新类中，同时在新类中暴露该成员对象的所有方法
 * 
 * @author Miracle
 * Created on 2016-02-23 18:52.
 */
public class SpaceShipDelegation {
	private SpaceShipControls controls = new SpaceShipControls();
	
	public void up(int velocity) {
		controls.up(velocity);
	}
	
	public void down(int velocity) {
		controls.down(velocity);
	}
	
	public void left(int velocity) {
		controls.left(velocity);
	}
	
	public void right(int velocity) {
		controls.right(velocity);
	}
	
	public void forward(int velocity) {
		controls.forward(velocity);
	}
	
	public void back(int velocity) {
		controls.back(velocity);
	}
	
	public void turboBoost() {
		controls.turboBoost();
	}
	
	public static void main(String[] args) {
		SpaceShipDelegation protector = new SpaceShipDelegation();
		protector.forward(100);
	}
}

/**
 * 太空船控制模块
 * 
 * @author Miracle
 * Created on 2016-02-23 18:52.
 */
class SpaceShipControls {
	void up(int velocity) {}
	
	void down(int velocity) {}
	
	void left(int velocity) {}
	
	void right(int velocity) {}
	
	void forward(int velocity) {}
	
	void back(int velocity) {}
	
	void turboBoost() {}
}
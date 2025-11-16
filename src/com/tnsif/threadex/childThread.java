package com.tnsif.threadex;
//by extends thread
public class childThread extends Thread
{
private int n;
private String msg;
public childThread(int n,String msg) {
	this.n=n;
	this.msg=msg;
	
}
public void run() {
	for(int i=1;i<=n;i++) {
		try {
			Thread.sleep(300);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			
	System.out.println(msg + i+ " "+Thread.currentThread().getName());
}
}}

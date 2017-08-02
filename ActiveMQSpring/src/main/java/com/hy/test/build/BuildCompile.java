package com.hy.test.build;

public class BuildCompile {
	private String memAddr;
	private  String zooAddr;

	public String getMemAddr() {
		return memAddr;
	}

	public void setMemAddr(String memAddr) {
		this.memAddr = memAddr;
	}

	public String getZooAddr() {
		return zooAddr;
	}

	public void setZooAddr(String zooAddr) {
		this.zooAddr = zooAddr;
	}

	public void init() {
		System.out.println("memcache地址：" + memAddr);
	}
	
	public void printMemAddr() {
		System.out.println("memAddr:" + memAddr);
	}
}

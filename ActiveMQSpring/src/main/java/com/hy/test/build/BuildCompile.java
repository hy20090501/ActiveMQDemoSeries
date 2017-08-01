package com.hy.test.build;

public class BuildCompile {
	private String memAddr;
	public static String zooAddr;

	public String getMemAddr() {
		return memAddr;
	}

	public void setMemAddr(String memAddr) {
		this.memAddr = memAddr;
	}

	public static String getZooAddr() {
		return zooAddr;
	}

	public static void setZooAddr(String zooAddr) {
		BuildCompile.zooAddr = zooAddr;
	}

	public void init() {
		System.out.println("memcache地址：" + memAddr);
	}
}

package com.jilegeji.springbootlearning.common;

public class Demo1_OutterInner {
	public static void main(String[] args){
           // 初始化Bean1
		   Demo1_OutterInner.Bean1 bean1 = new Demo1_OutterInner().new Bean1();
           bean1.I++;
           // 初始化Bean2
           Demo1_OutterInner.Bean2 bean2 = new Demo1_OutterInner.Bean2();
           bean2.J++;
           //初始化Bean3
           Bean bean = new Bean();
           Bean.Bean3 bean3 =  bean.new Bean3();
           bean3.k++;
    }

	class Bean1 {
		public int I = 0;
	}

	static class Bean2 {
		public int J = 0;
	}
}
	 
class Bean {
	class Bean3 {
		public int k = 0;
	}
}
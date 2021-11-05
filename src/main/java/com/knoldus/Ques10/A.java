//package com.knoldus.Ques10;
//public class A
//    {
//        String s = "AAA";
//
//        void methodA()
//        {
//            System.out.println(s);
//        }
//
//        static class B {
//            void methodB() {
//                methodA();
//            }
//        }
//        public static void main(String[] args) {
//            A a=new A();
//        }
//}

//------------------------------------EXPLANATION------------------------------------
//  We can not call non static method inside static method.
//  Hence the program will give the compile time error as below:
//  java: non-static method methodA() cannot be referenced from a static context

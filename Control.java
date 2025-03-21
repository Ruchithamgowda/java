class Control{  
    public static void main(String[] args) {  
        int a = 7;  
        int b = 20;  
        char op = '*';  
        boolean flag = true;  

        // if  
        if (a == 7){  
            System.out.println("a is 7");  
        }  

        // if-else  
        if (b%2== 0){  
            System.out.println("b is odd");  
        } 
		else{  
            System.out.println("b is even");  
        }  

        // while  
        while (flag){  
            System.out.println("Loop is running");  
            flag = false;  
        }  

        // for  
        System.out.println("for loop");  
        for (a=5; a<=b; a+=5){  
            System.out.println(a);  
        }  

        // switch  
        switch(op){  
            case '*':  
                System.out.println(a*b);  
                break;  
            case '/':  
                System.out.println(a/b);  
                break;  
            default:  
                System.out.println("invalid operation");  
        }  
    }  
}
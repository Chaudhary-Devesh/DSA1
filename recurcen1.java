class recurcen1 {
    public static void printDic(int n){
        if(n==1){
            System.out.print(n);
            return;

        }
        System.out.print(n+" ");
        printDic(n-1);
    }
    public static void printinc(int n){
        if(n==10){
            System.out.print(n);
            return;

        }
        System.out.print(n+" ");
        printinc(n+1);
    }
    public static void printinc1(int n){
        if(n==1){
            System.out.print(n+" ");
            return;

        }
        printinc1(n-1);
        System.out.print(n+" ");
        
    }
    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int x = n*fact(n-1);
        return x;

    }
    public static int natural(int n){
        if(n==0){
            return 0;
        }
        int sum = n+natural(n-1);
        return sum;
    }
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fb = fib(n-1)+fib(n-2);
        return fb;

    }
    public static boolean arrsort(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return arrsort(arr, i+1);
    }
    public static int keyFind(int[] arr,int i,int key){
        if(i>=arr.length-1){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }
        return keyFind(arr, i+1, key);
    }
    public static int lastfind(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        int isfind = lastfind(arr,i+1,key);
        if(isfind==-1 && arr[i]==key){
            return i;
        }
        return isfind;
    }
    public static int power(int x,int n){
        if(n==1){
            return x;
        }
        return x*power(x, n-1);
    }
    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }

        int ver = tiling(n-1);
        int hor = tiling(n-2);
        return ver + hor;
    }
    public static void removeDuplicates(String str, int idx,StringBuilder newstr,boolean[] map){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        char currchar = str.charAt(idx);
        if(map[currchar - 'a']==true){
            removeDuplicates(str, idx+1, newstr, map);
        }else{
            map[currchar-'a']=true;
            removeDuplicates(str, idx+1, newstr.append(currchar), map);
        }
    }
    public static int friendPair(int n){
        if(n==1||n==2){
            return n;
        }

        int fn1 = friendPair(n-1);
        int fn2 = (n-1)*friendPair(n-2);
        return fn1 + fn2;
    }
    public static void printBinString(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        printBinString(n-1, 0, str+="0");
        if(lastplace==0){
            printBinString(n-1, 1, str+="1");
        }
    }
    public static void main(String[] args) {
        // int n=25;
        // int arr[] = {1,2,3,5,4,5};
        // printinc(n);
        // printinc1(n); 
        // System.out.println(fact(n));
        // System.out.println(natural(n));
        // System.out.println(fib(n));
        // System.out.println(arrsort(arr, 0));
        // System.out.println(keyFind(arr, 0, 5));
        // System.out.println(lastfind(arr,0,5));
        // System.out.println(power(2, 10));
        // System.out.println(tiling(4));
        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(friendPair(3));
        printBinString(3, 0, "");

    } 
    
}

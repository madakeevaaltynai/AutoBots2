package com.autobots.codingBat.Array1;

import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {
        int[] a ={1,2,3};
        int[] b ={4,5,6};
        int[]result=middleWay(a,b);
        System.out.println(Arrays.toString(result));

    }
    public static boolean firstLast6(int nums[]){
        if(nums[0]==6|| nums[nums.length-1]==6){
            return true;
        }else{
            return false;
        }
    }
    public static boolean sameFirst(int[]nums){
        if (nums.length >= 1 && nums[0]==nums[nums.length-1]){
            return true;
        }else{
            return false;
        }

    }
    public static int [] makePi(){
        int[] myArray={3,1,4};
        return myArray;


    }
    public static boolean commonEnd(int[]a, int[]b){
       if(a[0]==b[0] || a[a.length-1]==b[b.length-1]){
           return true;
       }else{
           return false;
       }

    }

    public static int sum3(int[]nums){
        int sum=nums[0]+nums[1]+nums[3];
        return sum;

    }

    public static int []rotateLeft(int[]nums){
        return new int[]{nums[1],nums[2], nums[0]};
    }


    public static int[]reverse3(int []nums){
        return new int[]{nums[2], nums[1], nums[0]};
    }



    public static int[]maxEnd3(int[]nums){
       int max=0;
       if(nums[0]>nums[nums.length-1]){
           max=nums[0];
       }else{
           max=nums[nums.length-1];
       }
       return new int[]{max, max, max};
    }


    public static int sum2(int[]nums){
        if(nums.length>=2){
            return nums[0]+nums[1];
        }else if(nums.length==1){
            return nums[0];
        }else{
            return 0;
        }
    }
    public static int[]middleWay(int[]a, int[]b){
        return new int []{a[1], b[1]};
    }
public static int[]makeEnds(int []nums){
        return new int[]{nums[0], nums[nums.length-1]};
}
public static boolean has23(int []nums){
        if(nums[0]==2 || nums[1]==2 || nums[0]==3 || nums[1]==3){
            return true;
        }else{
            return  false;
        }
}
public static boolean no23(int[]nums){
        if(nums[0]!=2 && nums[1]!=2 && nums[0]!=3 && nums[1] !=3){
            return  true;
        }else{
            return false;
        }
}
public static int[]makeLAst(int[]nums){
       int len= nums.length*2;
       int []newArray=new int[len];
       newArray[len-1]=nums[nums.length-1];
       return newArray;

}
public static boolean double23(int[]nums) {
    if ((nums.length >= 2 && nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)) {
        return true;
    } else {
        return false;
    }


}
public static int []fix23(int []nums){
        if(nums.length>=3 && nums[0]==2 && nums[1]==3){
            nums[1]=0;
        }
        if(nums[1]==2 && nums[2]==2){
            nums[2]=0;
        }
        return nums;
}
public static int start1(int[]a, int []b){
        int count=0;
        if(a.length>0 && a[0]==1){
            count++;
        }
        if(b.length>0 && b[0]==1){
            count++;
        }
        return count;
}
public int[]biggerTwo(int[]a, int[]b){
        int sumA= a[0]+a[1];
        int sumB=b[0]+b[1];
        if(sumA>=sumB){
            return a;
        }else{
            return b;
        }
}
public static int[]makeMiddle(int []nums){
        //Делим длину на 2, чтобы найти центральную позицию
    // (правый из двух средних)

        int mid=nums.length /2;
    //Создаётся новый массив из двух чисел
    //
    //nums[mid - 1] — первый средний элемент
    //
    //nums[mid] — второй средний элемент
        return new int[]{nums[mid-1], nums[mid]};
}
public static int[]plusTwo(int[]a, int []b){
        return new int[]{a[0],a[1],b[0],b[1]};
}
public static int[]swapEnds(int[]nums){
        int temp=nums[0];// сохраняем первый элемент во временную переменную
        nums[0]=nums[nums.length-1];// первый элемент ← последний
        nums[nums.length-1]=temp;// последний элемент ← то, что было в первом
return nums;


}

}


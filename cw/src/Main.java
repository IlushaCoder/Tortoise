public class Main {


    public static int[] race(int v1, int v2, int g){
        if((v2>v1)&(g!=0)&(v1>0))
            return new int[]{(int)((float)(g)/((float)(v2-v1))),(int)((((float)(g)/((float)(v2-v1)))-(int)((float)(g)/((float)(v2-v1))))*60),(int)((((((float)(g)/((float)(v2-v1)))-(int)((float)(g)/((float)(v2-v1))))*60)-(int)((((float)(g)/((float)(v2-v1)))-(int)((float)(g)/((float)(v2-v1))))*60))*60)};
        else
            return null;
    }


    public static void main(String[] args) {
        int[] a = race(720,850,70); // пример выборки с code wars
        int[] b = race(80,100,40);
        System.out.println(a[0]+" "+a[1]+" "+a[2]);
        System.out.println(b[0]+" "+b[1]+" "+b[2]);
        //Tortoise racing

    }
}
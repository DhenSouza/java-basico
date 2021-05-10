package declaracao;

public class exemplo001 {

    public static void main(String[] args) {
        int[] meuArray = {12,32,54,6,8,89,64};

        meuArray[2] = 10;

        System.out.println(meuArray[2]);

        for(int i=0; i<7; i++){
            System.out.println(meuArray[i]);
        }
    }
}

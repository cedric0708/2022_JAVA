package P1;

class PrintShop{
    private char pChar;
    private int maxLine;

    PrintShop(){
        pChar = '#';
        maxLine=5;
    }

    PrintShop(char c){
        pChar=c;
    }

    PrintShop(char c, int i){
        pChar=c;
        maxLine=i;
    }

    void basicPrint(char pC, int maxL){
        int i,j;

        for(i=0; i<maxL; i++){
            for(j=0; j<(i+1); j++){
                System.out.print(pC);
            }
            System.out.println();
        }
    }

    void print(){
        int i,j;

        /* for(i=0; i<maxLine; i++){
            for(j=0; j<(i+1); j++){
                System.out.print(pChar);
            }
            System.out.println();
        }
        */
        basicPrint(pChar, maxLine);
    }

    void print(int max){
        int i,j;

        
        /*
        for(i=0; i<max; i++){
            for(j=0; j<(i+1); j++){
                System.out.print(pChar);
            }
            System.out.println();
        }
        */
        basicPrint(pChar, max);
    }

    void printReverse(){
        int i,j;
        i=maxLine;
        while(i>0){
            j=i;
            while(j>0){
                System.out.print(pChar);
                j--;
            }
            i--;
            System.out.println();
        }
    }

    void printReverse(int max){
        int i,j;
        i=max;
        while(i>0){
            j=i;
            while(j>0){
                System.out.print(pChar);
                j--;
            }
            i--;
            System.out.println();
        }
    }

    void setMax(int n){
        maxLine=n;
    }
}

public class P1{


    public static void main(String[] arghs){
        PrintShop ps1 = new PrintShop();
        PrintShop ps2 = new PrintShop('@');
        PrintShop ps3 = new PrintShop('$', 3);

        ps1.print();
        ps2.print();
        ps3.print();

        ps2.print(3);
        ps3.printReverse(5);
        ps2.setMax(7);
        ps2.printReverse();
    }
}

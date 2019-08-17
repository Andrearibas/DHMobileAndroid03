package br.com.digitalhouse.exercicio3;

public class CalculoMatematico {

    Integer valorDividido = 0;

//*Primeira situaçã
//   public int divisao(Integer umNum,Integer doisNum)
//    int divisao = 0
//       try {
//           valorDividido = umNum/doisNum;
//       }catch (ArithmeticException ex){
//           System.out.println("Operacao não pode ser realizada: "+ex.getMessage());
//           ex.printStackTrace();
//       }
//
//    }

    public int divisao(int umNum,int doisNum)throws ArithmeticException{
        if (doisNum ==0){
            throw new ArithmeticException("A operação não pode ser realizada");

        }return umNum/doisNum;
    }
}

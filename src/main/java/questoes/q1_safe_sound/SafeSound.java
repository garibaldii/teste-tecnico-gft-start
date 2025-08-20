package questoes.q1_safe_sound;

import java.util.Scanner;

public class SafeSound {

    private final Scanner scanner = new Scanner(System.in);

    public void execute() {
        System.out.println("Bem vindo ao Cofre digital com senha!");

        int count = 0;
        StringBuilder result = new StringBuilder();

        while (count < 3) {
            System.out.println("Digite 4 notas separadas por espaco (ex: DO RE MI FA)");
            String password = scanner.nextLine();


            if (password.matches("DÓ RÉ MI FÁ")){
                System.out.println("Cofre aberto com sucesso!");
                break;
            } else {
                count ++;
                System.out.println("Sequencia incorreta. Restam " + count + "/3");
            }
        }
        if(count == 3) System.out.println("Excedeu o maximo de tres tentativas, tente novamente mais tarde");
    }


    public static void main (String[] args) {
        SafeSound safeSound = new SafeSound();
        safeSound.execute();
    }
}

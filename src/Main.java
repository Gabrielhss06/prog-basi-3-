//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
            public static void main(String[] args) {

                Universidade princeton = new Universidade(" Princeton (Nova Jersey - Estados Unidos da América)");
                Universidade cambridge = new Universidade("Cambridge (Inglaterra)");


                Pessoa einstein = new Pessoa("Albert Einstein", "14/03/1879", princeton);
                Pessoa newton = new Pessoa("Isaac Newton", "04/01/1643", cambridge);

                einstein.dizerOndeTrabalha();
                newton.dizerOndeTrabalha();
            }
        }
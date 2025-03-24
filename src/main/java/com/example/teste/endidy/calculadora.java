    package com.example.teste.endidy;

    public class calculadora {
        public double soma(double a, double b) {
            return a + b;
        }

        public double subtracao(double a, double b) {
            return a - b;
        }

        public double multiplicacao(double a, double b) {
            return a * b;
        }

        public double divisao(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }
            return a / b;
        }

        public double potencia(double a, double b) {
            return Math.pow(a, b);
        }

        public double raiz(int a) {
            if (a < 0) {
                throw new ArithmeticException("Número negativo");
            }
            return Math.sqrt(a);
        }

        public double fatorial(int a) {
            if (a < 0) {
                throw new ArithmeticException("Fatorial de número negativo não é permitido.");
            }
            double fatorial = 1;
            for (int i = a; i > 0; i--) {
                fatorial *= i;
            }
            return fatorial;
        }

        public double media(int[] numeros) {
            double soma = 0;
            for (int i = 0; i < numeros.length; i++) {
                soma += numeros[i];
            }
            return soma / numeros.length;
        }

        public boolean primo(int a) {
            if (a <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public double somar(double a) {
            int soma = 0;


            while (a > 0) {
                soma += a % 10;
                a /= 10;
            }

            return soma;
        }

        public static void main(String[] args) {
            int[] numero = {1,2,3,4,5};
            System.out.println(new calculadora().somar(511));
        }
    }

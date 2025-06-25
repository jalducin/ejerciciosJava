public class EjercicioHilos {
    public static void main(String[] args) {
        String[] palabras = {"En", "Banco", "Azteca", "Sue\u00f1as", "Decides", "Logras"};

        for (int i = 0; i < palabras.length; i++) {
            final int id = i + 1;
            final String palabra = palabras[i];

            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(id * 1000); // Tiempo proporcional
                    System.out.println("Thread " + id + ": " + palabra);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }
}
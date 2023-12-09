static int wsClock() {
    Random random = new Random();
    int envelhecimentoPagina = random.nextInt(9900) + 100; // Gera EP entre 100 e 9999

    while (true) {
        int pageIndex = random.nextInt(RAM_ROWS);
        int paginaEP = matrizRAM[pageIndex][5]; // Campo de Envelhecimento T (Assumindo que está na coluna 5)

        if (paginaEP <= envelhecimentoPagina) {
            return pageIndex;
        }
    }
}
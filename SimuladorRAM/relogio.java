static int clockPointer = 0;

static int relogio() {
    while (true) {
        int pageIndex = clockPointer;
        clockPointer = (clockPointer + 1) % RAM_ROWS; // Atualiza o ponteiro circular

        int rBit = matrizRAM[pageIndex][3]; // Bit de Acesso R (Assumindo que está na coluna 3)
        if (rBit == 0) {
            return pageIndex;
        } else {
            matrizRAM[pageIndex][3] = 0; // Reseta o bit de acesso R
        }
    }
}
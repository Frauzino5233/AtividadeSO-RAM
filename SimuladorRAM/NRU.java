static int NRU(int[][] ram) {
    ArrayList<Integer> classes[] = new ArrayList[4];
    for (int i = 0; i < 4; i++) {
        classes[i] = new ArrayList<>();
    }

    for (int i = 0; i < RAM_ROWS; i++) {
        int rBit = ram[i][3]; // Bit de Acesso R (Assumindo que está na coluna 3)
        int mBit = ram[i][4]; // Bit de Modificação M (Assumindo que está na coluna 4)

        int nruClass = (rBit << 1) | mBit;
        classes[nruClass].add(i);
    }

    for (int i = 0; i < 4; i++) {
        if (!classes[i].isEmpty()) {
            int randomIndex = new Random().nextInt(classes[i].size());
            return classes[i].get(randomIndex);
        }
    }

    return -1;
}
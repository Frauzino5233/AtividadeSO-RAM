static Queue<Integer> fifoSCQueue = new LinkedList<>();
static boolean[] secondChanceBits = new boolean[RAM_ROWS];

static int fifoSC() {
    while (true) {
        int pageIndex = fifoSCQueue.poll(); // Remove o índice da página mais antiga
        if (secondChanceBits[pageIndex]) {
            fifoSCQueue.offer(pageIndex); // Insere de volta no final da fila
            secondChanceBits[pageIndex] = false; // Reseta o bit de segunda chance
        } else {
            fifoSCQueue.offer(pageIndex); // Insere o índice da página mais recente no final da fila
            return pageIndex;
        }
    }
}
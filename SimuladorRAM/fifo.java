static Queue<Integer> fifoQueue = new LinkedList<>();

static int fifo() {
    int pageIndex = fifoQueue.poll(); // Remove o índice da página mais antiga
    fifoQueue.offer(pageIndex); // Insere o índice da página mais recente no final da fila
    return pageIndex;
}
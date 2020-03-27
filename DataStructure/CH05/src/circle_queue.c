#include<stdio.h>
#include<stdlib.h>

// ===== ����ť ���� =====
#define MAX_QUEUE_SIZE 5
typedef int element;
typedef struct {    // ť Ÿ��
    element data[MAX_QUEUE_SIZE];
    int front, rear;
} QueueType;

// ���� �Լ�
void error(char *message)
{
    fprintf(stderr, "%s\n", message);
    exit(1);
}

// �ʱ�ȭ �Լ�
void init_queue(QueueType *q)
{
    q->front = q->rear = 0;
}

// ���� ���� ���� �Լ�
int is_empty(QueueType *q)
{
    return (q->front == q->rear);
}

// ��ȭ ���� ���� �Լ�
int is_full(QueueType *q)
{
    return ((q->rear + 1) % MAX_QUEUE_SIZE == q->front);
}

// ����ť ��� �Լ�
void queue_print(QueueType *q)
{
    printf("QUEUE(front=%d read=%d) = ", q->front, q->rear);
    if (!is_empty(q)) {
        int i = q->front;
        do {
            i = (i + 1) % (MAX_QUEUE_SIZE);
            printf("%d | ", q->data[i]);
            if (i == q->rear) {
                break;
            }
        } while ( i != q->front);
    }
    printf("\n");
}

// ���� �Լ�
void enqueue(QueueType *q, element item)
{
    if (is_full(q)) {
        error("ť�� ��ȭ�����Դϴ�.");
    }
    q->rear = (q->rear + 1) % MAX_QUEUE_SIZE;
    q->data[q->rear] = item;
}

// ���� �Լ�
element dequeue(QueueType *q)
{
    if (is_empty(q)) {
        error("ť�� ��������Դϴ�.");
    }
    q->front = (q->front + 1) % MAX_QUEUE_SIZE;
    return q->data[q->front];
}

// ��ũ �Լ�
element peek(QueueType *q)
{
    if (is_empty(q)) {
        error("ť�� ��������Դϴ�.");
    }
    return q->data[(q->front + 1) % MAX_QUEUE_SIZE];
}
// ===== ����ť �ڵ� �� =====

int main()
{
    QueueType queue;
    int element;

    init_queue(&queue);
    printf("--������ �߰� �ܰ�--\n");
    while (!is_full(&queue)) {
        printf("������ �Է��Ͻÿ�: ");
        scanf("%d", &element);
        enqueue(&queue, element);
        queue_print(&queue);
    }
    printf("ť�� ��ȭ�����Դϴ�.\n\n");

    printf("--������ ���� �ܰ�--\n");
    while (!is_empty(&queue)) {
        element = dequeue(&queue);
        printf("������ ����: %d \n", element);
        queue_print(&queue);
    }
    printf("ť�� ��������Դϴ�.\n");
    return 0;
}
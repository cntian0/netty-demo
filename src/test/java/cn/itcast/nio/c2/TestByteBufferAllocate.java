package cn.itcast.nio.c2;

import java.nio.ByteBuffer;

/**
 * @author tiancn
 * @date 2023/3/10 20:01
 */
public class TestByteBufferAllocate {
    public static void main(String[] args) {
        System.out.println(ByteBuffer.allocate(16).getClass());
        System.out.println(ByteBuffer.allocateDirect(16).getClass());
        /**
         * class java.nio.HeapByteBuffer -java堆内存 ，读写效率较低，受到GC影响
         * class java.nio.DirectByteBuffer -直接内存，读写效率高（少一次拷贝）不会受GC影响 分配的效率低
         */

    }
}

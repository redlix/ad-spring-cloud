package com.imooc.ad.service;

import com.github.shyiko.mysql.binlog.BinaryLogClient;
import com.github.shyiko.mysql.binlog.event.DeleteRowsEventData;
import com.github.shyiko.mysql.binlog.event.EventData;
import com.github.shyiko.mysql.binlog.event.UpdateRowsEventData;
import com.github.shyiko.mysql.binlog.event.WriteRowsEventData;

import java.io.IOException;

/**
 * ${desc}
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/03/12     red        -
 * </pre>
 *
 * @author redli
 * @version 1.0.0 2019-03-12 15:43
 * @date 2019-03-12 15:43
 * @since 1.0.0
 */
public class BinLogServiceTest {
    public static void main(String[] args) throws IOException {
        BinaryLogClient client = new BinaryLogClient(
                "127.0.0.1",
                3306,
                "root",
                "root"
        );
//        client.setBinlogFilename();
//        client.setBinlogPosition();
        client.registerEventListener(event -> {
            EventData data = event.getData();

            if (data instanceof UpdateRowsEventData) {
                System.out.println("update......");
                System.out.println(data.toString());
            } else if (data instanceof WriteRowsEventData) {
                System.out.println("write......");
                System.out.println(data.toString());
            } else if (data instanceof DeleteRowsEventData) {
                System.out.println("delete......");
                System.out.println(data.toString());
            }
        });
        client.connect();
    }
}

package com.github.fppt.jedismock.operations;

import com.github.fppt.jedismock.server.Response;
import com.github.fppt.jedismock.server.Slice;
import com.github.fppt.jedismock.storage.RedisBase;
import java.util.List;

/**
 * Created by kungwang on 12/28/19.
 */
public class RO_dbsize extends AbstractRedisOperation {

    RO_dbsize(RedisBase base, List<Slice> params) {
        super(base, params);
    }

    Slice response() {
        return Response.integer(base().keys().size());
    }

}

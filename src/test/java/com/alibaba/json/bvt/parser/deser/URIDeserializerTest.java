package com.alibaba.json.bvt.parser.deser;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultExtJSONParser;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.SimpleTypeDeserializer;

public class URIDeserializerTest extends TestCase {

    public void test_null() throws Exception {
        String input = "null";
        DefaultExtJSONParser parser = new DefaultExtJSONParser(input, ParserConfig.getGlobalInstance(), JSON.DEFAULT_PARSER_FEATURE);

        SimpleTypeDeserializer deser = new SimpleTypeDeserializer();
        Assert.assertEquals(JSONToken.LITERAL_STRING, deser.getFastMatchToken());

        Assert.assertNull(deser.deserialze(parser, null, null));
    }

}

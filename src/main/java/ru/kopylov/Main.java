package ru.kopylov;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;


import ru.kopylov.book.top.Story;

public class Main {
    public static void main(String[] args) throws Exception {
        JAXBContext context = JAXBContext.newInstance(Story.class);

        SchemaOutputResolver resolver = new SchemaOutputResolver() {
            @Override
            public Result createOutput(String namespaceUri, String suggestedFileName) {
                try {
                    File file = new File(suggestedFileName);
                    StreamResult result = new StreamResult(file);
                    result.setSystemId(file.toURI().toURL().toString());
                    return result;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        };


        context.generateSchema(resolver);
    }
}
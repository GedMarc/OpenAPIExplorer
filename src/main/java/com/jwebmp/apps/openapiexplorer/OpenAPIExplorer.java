package com.jwebmp.apps.openapiexplorer;

import com.guicedee.guicedservlets.undertow.GuicedUndertow;
import com.jwebmp.core.Page;
import com.jwebmp.core.services.IPage;

public class OpenAPIExplorer
        extends Page<OpenAPIExplorer>
        implements IPage<OpenAPIExplorer> {

    public static void main(String[] args) throws Exception {
        new GuicedUndertow()
                .setPort(8500)
                .bootMe();
    }
    public OpenAPIExplorer() {
    }

}

package com.github.mrcheeze446.jetbrainsdcclasssupport.language;

import com.intellij.lexer.FlexAdapter;
import org.intellij.sdk.language.DCLexer;

public class DCLexerAdapter extends FlexAdapter {

    public DCLexerAdapter() {
        super(new DCLexer(null));
    }
}

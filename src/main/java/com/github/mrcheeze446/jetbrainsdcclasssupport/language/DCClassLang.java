package com.github.mrcheeze446.jetbrainsdcclasssupport.language;

import com.intellij.lang.Language;

public class DCClassLang extends Language {
    public static final DCClassLang INSTANCE = new DCClassLang();

    private DCClassLang() {
        super("DCClass");
    }
}

package com.github.mrcheeze446.jetbrainsdcclasssupport.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class DCClassType extends LanguageFileType {
    public static final DCClassType INSTANCE = new DCClassType();

    private DCClassType() {
        super(DCClassLang.INSTANCE);
    }


    @Override
    @NotNull
    public String getName() {
        return "Panda3D DC File";
    }

    @Override
    @NotNull
    public String getDescription() {
        return "A distributed class file used by panda3D";
    }

    @Override
    @NotNull
    public String getDefaultExtension() {
        return "dc";
    }

    @Override
    public Icon getIcon() {
        return DCClassIcon.FILE;
    }
}

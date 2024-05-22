package com.github.mrcheeze446.jetbrainsdcclasssupport.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;
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
        return "DCClass File";
    }

    @Override
    @NotNull
    public String getDescription() {
        return "A Distributed Class file used by Panda3D";
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

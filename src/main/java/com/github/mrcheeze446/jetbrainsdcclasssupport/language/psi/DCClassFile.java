package com.github.mrcheeze446.jetbrainsdcclasssupport.language.psi;

import com.github.mrcheeze446.jetbrainsdcclasssupport.language.DCClassLang;
import com.github.mrcheeze446.jetbrainsdcclasssupport.language.DCClassType;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class DCClassFile extends PsiFileBase {

    public DCClassFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, DCClassLang.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return DCClassType.INSTANCE;
    }

    @Override
    public String toString() {
        return "DCClass File";
    }

}

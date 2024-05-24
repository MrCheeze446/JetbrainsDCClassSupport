package com.github.mrcheeze446.jetbrainsdcclasssupport.language.psi;

import com.github.mrcheeze446.jetbrainsdcclasssupport.language.DCClassLang;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class DCClassElementType extends IElementType {

    public DCClassElementType(@NonNls @NotNull String debugName) {
        super(debugName, DCClassLang.INSTANCE);
    }
}

package com.github.mrcheeze446.jetbrainsdcclasssupport.language.psi;

import com.github.mrcheeze446.jetbrainsdcclasssupport.language.DCClassLang;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class DCClassTokenType extends IElementType {

    public DCClassTokenType(@NotNull @NonNls String debugName) {
        super(debugName, DCClassLang.INSTANCE);
    }

    @Override
    public String toString() {
        return "DCClassTokenType." + super.toString();
    }
}

package com.github.mrcheeze446.jetbrainsdcclasssupport.language.psi;

import com.github.mrcheeze446.jetbrainsdcclasssupport.language.DCClassTypes;
import com.intellij.psi.tree.TokenSet;

public interface DCClassTokenSets {
    TokenSet IDENTIFIERS = TokenSet.create(DCClassTypes.KEY);

    TokenSet COMMENTS = TokenSet.create(DCClassTypes.COMMENT);

}

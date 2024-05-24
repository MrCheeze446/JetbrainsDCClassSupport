package com.github.mrcheeze446.jetbrainsdcclasssupport.language;

import com.github.mrcheeze446.jetbrainsdcclasssupport.language.psi.DCClassFile;
import com.github.mrcheeze446.jetbrainsdcclasssupport.language.psi.DCClassTokenSets;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

final class DCClassParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(DCClassLang.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new DCLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return DCClassTokenSets.COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new parser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new DCClassFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return DCClassTypes.Factory.createElement(node);
    }
}

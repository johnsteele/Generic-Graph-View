
/*
 * generated by Xtext
 */
package org.eclipse.xtext.graphview.map.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.DefaultUiModule;

/**
 * Manual modifications go to {org.eclipse.xtext.graphview.map.ui.GraphViewMappingUiModule}
 */
@SuppressWarnings("all")
public abstract class AbstractGraphViewMappingUiModule extends DefaultUiModule {
	
	public AbstractGraphViewMappingUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	
	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public com.google.inject.Provider<org.eclipse.xtext.resource.containers.IAllContainersState> provideIAllContainersState() {
		return org.eclipse.xtext.ui.shared.Access.getJavaProjectsState();
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.IProposalConflictHelper> bindIProposalConflictHelper() {
		return org.eclipse.xtext.ui.editor.contentassist.antlr.AntlrProposalConflictHelper.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public void configureHighlightingLexer(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.parser.antlr.Lexer.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.ui.LexerUIBindings.HIGHLIGHTING)).to(org.eclipse.xtext.graphview.map.parser.antlr.internal.InternalGraphViewMappingLexer.class);
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public void configureHighlightingTokenDefProvider(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.parser.antlr.ITokenDefProvider.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.ui.LexerUIBindings.HIGHLIGHTING)).to(org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider.class);
	}

	// contributed by org.eclipse.xtext.generator.exporting.QualifiedNamesFragment
	public Class<? extends org.eclipse.xtext.ui.refactoring.IDependentElementsCalculator> bindIDependentElementsCalculator() {
		return org.eclipse.xtext.ui.refactoring.impl.DefaultDependentElementsCalculator.class;
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public void configureIResourceDescriptionsBuilderScope(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.resource.IResourceDescriptions.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider.NAMED_BUILDER_SCOPE)).to(org.eclipse.xtext.builder.clustering.CurrentDescriptions.ResourceSetAware.class);
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
		return org.eclipse.xtext.builder.nature.NatureAddingEditorCallback.class;
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public void configureIResourceDescriptionsPersisted(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.resource.IResourceDescriptions.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.builder.impl.PersistentDataAwareDirtyResource.PERSISTED_DESCRIPTIONS)).to(org.eclipse.xtext.builder.builderState.IBuilderState.class);
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.ui.editor.DocumentBasedDirtyResource> bindDocumentBasedDirtyResource() {
		return org.eclipse.xtext.builder.impl.PersistentDataAwareDirtyResource.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.labeling.LabelProviderFragment
	public Class<? extends org.eclipse.jface.viewers.ILabelProvider> bindILabelProvider() {
		return org.eclipse.xtext.graphview.map.ui.labeling.GraphViewMappingLabelProvider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.labeling.LabelProviderFragment
	public void configureResourceUIServiceLabelProvider(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.jface.viewers.ILabelProvider.class).annotatedWith(org.eclipse.xtext.ui.resource.ResourceServiceDescriptionLabelProvider.class).to(org.eclipse.xtext.graphview.map.ui.labeling.GraphViewMappingDescriptionLabelProvider.class);
	}

	// contributed by org.eclipse.xtext.ui.generator.outline.OutlineTreeProviderFragment
	public Class<? extends org.eclipse.xtext.ui.editor.outline.IOutlineTreeProvider> bindIOutlineTreeProvider() {
		return org.eclipse.xtext.graphview.map.ui.outline.GraphViewMappingOutlineTreeProvider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.outline.OutlineTreeProviderFragment
	public Class<? extends org.eclipse.xtext.ui.editor.outline.impl.IOutlineTreeStructureProvider> bindIOutlineTreeStructureProvider() {
		return org.eclipse.xtext.graphview.map.ui.outline.GraphViewMappingOutlineTreeProvider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.quickfix.QuickfixProviderFragment
	public Class<? extends org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider> bindIssueResolutionProvider() {
		return org.eclipse.xtext.graphview.map.ui.quickfix.GraphViewMappingQuickfixProvider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.contentAssist.JavaBasedContentAssistFragment
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.IContentProposalProvider> bindIContentProposalProvider() {
		return org.eclipse.xtext.graphview.map.ui.contentassist.GraphViewMappingProposalProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrUiGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext.Factory> bindContentAssistContext$Factory() {
		return org.eclipse.xtext.ui.editor.contentassist.antlr.ParserBasedContentAssistContextFactory.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrUiGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.antlr.IContentAssistParser> bindIContentAssistParser() {
		return org.eclipse.xtext.graphview.map.ui.contentassist.antlr.GraphViewMappingParser.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrUiGeneratorFragment
	public void configureContentAssistLexerProvider(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.graphview.map.ui.contentassist.antlr.internal.InternalGraphViewMappingLexer.class).toProvider(org.eclipse.xtext.parser.antlr.LexerProvider.create(org.eclipse.xtext.graphview.map.ui.contentassist.antlr.internal.InternalGraphViewMappingLexer.class));
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrUiGeneratorFragment
	public void configureContentAssistLexer(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.ui.LexerUIBindings.CONTENT_ASSIST)).to(org.eclipse.xtext.graphview.map.ui.contentassist.antlr.internal.InternalGraphViewMappingLexer.class);
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public java.lang.ClassLoader bindClassLoaderToInstance() {
		return getClass().getClassLoader();
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.common.types.access.IJvmTypeProvider.Factory> bindIJvmTypeProvider$Factory() {
		return org.eclipse.xtext.common.types.access.jdt.JdtTypeProviderFactory.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.common.types.xtext.AbstractTypeScopeProvider> bindAbstractTypeScopeProvider() {
		return org.eclipse.xtext.common.types.xtext.ui.JdtBasedSimpleTypeScopeProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.common.types.xtext.ui.ITypesProposalProvider> bindITypesProposalProvider() {
		return org.eclipse.xtext.common.types.xtext.ui.JdtTypesProposalProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider> bindIJavaProjectProvider() {
		return org.eclipse.xtext.common.types.xtext.ui.XtextResourceSetBasedProjectProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkHelper> bindIHyperlinkHelper() {
		return org.eclipse.xtext.common.types.xtext.ui.TypeAwareHyperlinkHelper.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher> bindPrefixMatcher() {
		return org.eclipse.xtext.ui.editor.contentassist.FQNPrefixMatcher.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.IValidationJobScheduler> bindIValidationJobScheduler() {
		return org.eclipse.xtext.common.types.xtext.ui.JdtValidationJobScheduler.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.refactoring.impl.RefactoringResourceSetProvider> bindRefactoringResourceSetProvider() {
		return org.eclipse.xtext.common.types.ui.refactoring.JvmRefactoringResourceSetProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return org.eclipse.xtext.xbase.ui.syntaxcoloring.XbaseTokenToAttributeIdMapper.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.AbstractJavaBasedContentProposalProvider.ReferenceProposalCreator> bindAbstractJavaBasedContentProposalProvider$ReferenceProposalCreator() {
		return org.eclipse.xtext.xbase.ui.contentassist.XbaseReferenceProposalCreator.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.jface.text.contentassist.IContentAssistProcessor> bindIContentAssistProcessor() {
		return org.eclipse.xtext.ui.editor.contentassist.RepeatedContentAssistProcessor.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingCalculator.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider> bindIEObjectHoverProvider() {
		return org.eclipse.xtext.xbase.ui.hover.XbaseHoverProvider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.templates.CodetemplatesGeneratorFragment
	public com.google.inject.Provider<org.eclipse.xtext.ui.codetemplates.ui.preferences.TemplatesLanguageConfiguration> provideTemplatesLanguageConfiguration() {
		return org.eclipse.xtext.ui.codetemplates.ui.AccessibleCodetemplatesActivator.getTemplatesLanguageConfigurationProvider();
	}

	// contributed by org.eclipse.xtext.ui.generator.templates.CodetemplatesGeneratorFragment
	public com.google.inject.Provider<org.eclipse.xtext.ui.codetemplates.ui.registry.LanguageRegistry> provideLanguageRegistry() {
		return org.eclipse.xtext.ui.codetemplates.ui.AccessibleCodetemplatesActivator.getLanguageRegistry();
	}

	// contributed by org.eclipse.xtext.ui.generator.templates.CodetemplatesGeneratorFragment
	@org.eclipse.xtext.service.SingletonBinding(eager=true)	public Class<? extends org.eclipse.xtext.ui.codetemplates.ui.registry.LanguageRegistrar> bindLanguageRegistrar() {
		return org.eclipse.xtext.ui.codetemplates.ui.registry.LanguageRegistrar.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.templates.CodetemplatesGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.templates.XtextTemplatePreferencePage> bindXtextTemplatePreferencePage() {
		return org.eclipse.xtext.ui.codetemplates.ui.preferences.AdvancedTemplatesPreferencePage.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.templates.CodetemplatesGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.codetemplates.ui.partialEditing.IPartialContentAssistParser> bindIPartialContentAssistParser() {
		return org.eclipse.xtext.graphview.map.ui.contentassist.antlr.PartialGraphViewMappingContentAssistParser.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.refactoring.RefactorElementNameFragment
	public Class<? extends org.eclipse.xtext.ui.refactoring.IRenameStrategy> bindIRenameStrategy() {
		return org.eclipse.xtext.ui.refactoring.impl.DefaultRenameStrategy.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.refactoring.RefactorElementNameFragment
	public Class<? extends org.eclipse.xtext.ui.refactoring.IReferenceUpdater> bindIReferenceUpdater() {
		return org.eclipse.xtext.ui.refactoring.impl.DefaultReferenceUpdater.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.refactoring.RefactorElementNameFragment
	public void configureIPreferenceStoreInitializer(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer.class).annotatedWith(com.google.inject.name.Names.named("RefactoringPreferences")).to(org.eclipse.xtext.ui.refactoring.ui.RefactoringPreferences.Initializer.class);
	}

	// contributed by org.eclipse.xtext.ui.generator.refactoring.RefactorElementNameFragment
	public Class<? extends org.eclipse.xtext.ui.refactoring.ui.IRenameElementHandler> bindIRenameElementHandler() {
		return org.eclipse.xtext.common.types.ui.refactoring.JvmRenameElementHandler.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.refactoring.RefactorElementNameFragment
	public Class<? extends org.eclipse.xtext.ui.refactoring.IRenameRefactoringProvider> bindIRenameRefactoringProvider() {
		return org.eclipse.xtext.common.types.ui.refactoring.JvmRenameRefactoringProvider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.refactoring.RefactorElementNameFragment
	public Class<? extends org.eclipse.xtext.ui.refactoring.ui.IRenameSupport.Factory> bindIRenameSupport$Factory() {
		return org.eclipse.xtext.common.types.ui.refactoring.JdtRenameSupport.Factory.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.refactoring.RefactorElementNameFragment
	public Class<? extends org.eclipse.xtext.ui.refactoring.IRenameStrategy.Provider> bindIRenameStrategy$Provider() {
		return org.eclipse.xtext.common.types.ui.refactoring.participant.JvmMemberRenameStrategy.Provider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.refactoring.RefactorElementNameFragment
	public void configureJvmMemberRenameStrategy$Provider$Delegate(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.ui.refactoring.IRenameStrategy.Provider.class).annotatedWith(org.eclipse.xtext.common.types.ui.refactoring.participant.JvmMemberRenameStrategy.Provider.Delegate.class).to(org.eclipse.xtext.ui.refactoring.impl.DefaultRenameStrategyProvider.class);
	}

	// contributed by org.eclipse.xtext.ui.generator.compare.CompareFragment
	public Class<? extends org.eclipse.compare.IViewerCreator> bindIViewerCreator() {
		return org.eclipse.xtext.ui.compare.DefaultViewerCreator.class;
	}


}

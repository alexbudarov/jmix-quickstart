package com.company.jmixpm.screen.projectdocument;

import io.jmix.ui.screen.*;
import com.company.jmixpm.entity.ProjectDocument;

@UiController("ProjectDocument.edit")
@UiDescriptor("project-document-edit.xml")
@EditedEntityContainer("projectDocumentDc")
public class ProjectDocumentEdit extends StandardEditor<ProjectDocument> {
}
package com.company.jmixpm.screen.projectdocument;

import io.jmix.core.FileRef;
import io.jmix.ui.screen.*;
import com.company.jmixpm.entity.ProjectDocument;

@UiController("ProjectDocument.browse")
@UiDescriptor("project-document-browse.xml")
@LookupComponent("projectDocumentsTable")
public class ProjectDocumentBrowse extends StandardLookup<ProjectDocument> {
    @Install(to = "projectDocumentsTable.file", subject = "formatter")
    private String projectDocumentsTableFileFormatter(FileRef object) {
        return object != null ? object.getFileName() : null;
    }
}
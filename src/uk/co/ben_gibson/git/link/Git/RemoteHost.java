package uk.co.ben_gibson.git.link.Git;

import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public enum RemoteHost
{
    GIT_HUB("GitHub", "/Icons/GitHub/GitHub.png"),
    STASH("Stash", "/Icons/Bitbucket/Bitbucket.png"),
    BITBUCKET("Bitbucket", "/Icons/Bitbucket/Bitbucket.png"),
    GITLAB("GitLab", "/Icons/GitLab/GitLab.png"),
    GITBLIT("GitBlit", ""),
    GITEA("Gitea", "/Icons/Gitea/Gitea.png"),
    GOGS("Gogs", "/Icons/Gogs/Gogs.png"),
    CUSTOM("Custom", "/Icons/Custom/Custom.png");

    private final String name;
    private final String icon;

    RemoteHost(@NotNull String name, @NotNull String icon)
    {
        this.name = name;
        this.icon = icon;
    }

    @NotNull
    public String toString()
    {
        return this.name;
    }

    public boolean isCustom()
    {
        return (this == CUSTOM);
    }

    public boolean isGitBlit()
    {
        return (this == GITBLIT);
    }

    public boolean isGitHub()
    {
        return (this == GIT_HUB);
    }

    public boolean isGitLab()
    {
        return (this == GITLAB);
    }

    public boolean isBitbucket()
    {
        return (this == BITBUCKET);
    }

    public boolean isStash()
    {
        return (this == STASH);
    }

    public boolean isGitea()
    {
        return (this == GITEA);
    }

    public boolean isGogs()
    {
        return (this == GOGS);
    }

    @NotNull
    public Icon icon()
    {
        return IconLoader.getIcon(this.icon);
    }
}
